package io.behzod.data.dto

import kotlin.math.roundToInt

data class Snippet(
  val start: Int = 0,
  val end: Int = 0
) {
  constructor(range: ClosedFloatingPointRange<Float>) : this(
    range.start.roundToInt(),
    range.endInclusive.roundToInt()
  )
}
