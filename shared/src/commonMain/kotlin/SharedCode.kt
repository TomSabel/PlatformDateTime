// Common code (shared module)
import kotlinx.datetime.Instant
import kotlin.time.Duration.Companion.days

expect class PlatformDateTime

internal expect fun PlatformDateTime.fromPlatform(): Instant

internal expect fun Instant.toPlatform(): PlatformDateTime

fun doSomething(date: PlatformDateTime): PlatformDateTime {
    return date
        .fromPlatform()
        .plus(10.days)
        .toPlatform()
}