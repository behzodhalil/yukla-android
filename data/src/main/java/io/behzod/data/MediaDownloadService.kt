package io.behzod.data

import io.behzod.data.dto.DownloadDetails

interface MediaDownloadService {
  fun fetchPlaylistOrVideoDetails(playlistUrl: String): Result<DownloadDetails>
  fun fetchVideoFromUrl(url: String, playlistItemCount: Int = 0)
}
