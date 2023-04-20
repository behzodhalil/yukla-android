package io.behzod.data.dto

data class VideoFormat(
    val formatId: String? = null,
    val formatNode: String? = null,
    val extension: String? = null,
    val aCodec: String? = null,
    val vCodec: String? = null,
    val url: String? = null,
    val width: Int? = null,
    val height: Int? = null,
    val fps: Double? = null,
    val audioExt: String? = null,
    val videoExt: String? = null,
    val format: String? = null,
    val resolution: String? = null,
    val vbr: Double? = null,
    val abr: Double? = null,
    val tbr: Double? = null,
    val fileSize: Double? = null,
    val fileSizeApprox: Double? = null
)
