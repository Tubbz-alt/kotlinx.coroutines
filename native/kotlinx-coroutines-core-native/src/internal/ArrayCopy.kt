/*
 * Copyright 2016-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license.
 */

package kotlinx.coroutines.experimental.internal

internal actual fun <E> arraycopy(
    source: Array<E>,
    srcPos: Int,
    destination: Array<E?>,
    destinationStart: Int,
    length: Int
) {
    var destinationIndex = destinationStart
    for (sourceIndex in srcPos until srcPos + length) {
        destination[destinationIndex++] = source[sourceIndex]
    }
}
