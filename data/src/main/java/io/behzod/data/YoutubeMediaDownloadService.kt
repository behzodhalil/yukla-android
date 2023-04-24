package io.behzod.data

import androidx.annotation.CheckResult
import com.yausername.youtubedl_android.YoutubeDL
import com.yausername.youtubedl_android.YoutubeDLRequest
import com.yausername.youtubedl_android.YoutubeDLResponse
import io.behzod.data.dto.DownloadDetails
import io.behzod.data.dto.PlaylistResult
import io.behzod.data.dto.VideoInfo
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

class YoutubeMediaDownloadService : MediaDownloadService {

  private val jsonFormat = Json {
    ignoreUnknownKeys = true
  }

  @CheckResult
  override fun fetchPlaylistOrVideoDetails(playlistUrl: String): Result<DownloadDetails> {
    return try {
      val request = YoutubeDLRequest(playlistUrl)

      with(request) {
        addOption("--compat-options", "no-youtube-unavailable-videos")
        addOption("--flat-playlist")
        addOption("-J")
        addOption("-R", "1")
        addOption("--socket-timeout", "5")
      }
      val result = YoutubeDL.getInstance().execute(request, null)
      val playlistInfo = jsonFormat.decodeFromString<PlaylistResult>(checkNotNull(result.out))

      YoutubeDL.getInstance().execute(request, null).out.run {
        val playlistInfo = jsonFormat.decodeFromString<PlaylistResult>(result.out)
        if (playlistInfo.type != "playlist") {
          Result.success(jsonFormat.decodeFromString<VideoInfo>(this))
        } else {
          Result.success(playlistInfo)
        }
      }
    } catch (e: Exception) {
      Result.failure(e)
    }
  }

  override fun fetchVideoFromUrl(url: String, playlistItemCount: Int) {
    TODO("Not yet implemented")
  }

  private fun getVideoInfo(request: YoutubeDLRequest): Result<VideoInfo> {
    return request.addOption("--dump-json").runCatching {
      val response: YoutubeDLResponse = YoutubeDL.getInstance().execute(request,null)
      jsonFormat.decodeFromString(response.out)
    }
  }
}
