import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant
import kotlinx.datetime.toJavaInstant
import kotlinx.datetime.toKotlinLocalDateTime
import java.time.LocalDateTime
import java.time.ZoneId

actual typealias PlatformDateTime = LocalDateTime

internal actual fun PlatformDateTime.fromPlatform(): Instant =
    toKotlinLocalDateTime().toInstant(TimeZone.currentSystemDefault())

internal actual fun Instant.toPlatform(): PlatformDateTime =
    LocalDateTime.ofInstant(toJavaInstant(), ZoneId.systemDefault())