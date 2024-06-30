import kotlinx.datetime.Instant
import kotlinx.datetime.toKotlinInstant
import kotlinx.datetime.toNSDate
import platform.Foundation.NSDate

actual typealias PlatformDateTime = NSDate

internal actual fun PlatformDateTime.fromPlatform(): Instant = toKotlinInstant()

internal actual fun Instant.toPlatform(): PlatformDateTime = toNSDate()
