package app.template.patches.tiktok_lite.telemetry

import app.morphe.patcher.Fingerprint

private const val LITE_APPLOG = "LMiniLiteApplogServiceImpl;"
private const val NET_CLIENT = "LAppLogNetworkClient;"

internal object ApplogOnEventFingerprint : Fingerprint(
    definingClass = LITE_APPLOG,
    name = "onEvent",
    returnType = "V",
    parameters = listOf(
        "Landroid/content/Context;",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "Ljava/lang/Boolean;",
        "Lorg/json/JSONObject;",
    ),
)

internal object ApplogInitStatisticLoggerFingerprint : Fingerprint(
    definingClass = LITE_APPLOG,
    name = "initStatisticLogger",
    returnType = "V",
    parameters = listOf("Landroid/content/Context;"),
)

internal object ApplogStatisticLoggerInitFingerprint : Fingerprint(
    definingClass = LITE_APPLOG,
    name = "statisticLoggerInit",
    returnType = "V",
    parameters = emptyList(),
)

internal object ApplogReportPendingFingerprint : Fingerprint(
    definingClass = LITE_APPLOG,
    name = "reportPending",
    returnType = "V",
    parameters = emptyList(),
)

internal object ApplogConfigFingerprint : Fingerprint(
    definingClass = LITE_APPLOG,
    name = "config",
    returnType = "V",
    parameters = emptyList(),
)

internal object ApplogBeforeInitFingerprint : Fingerprint(
    definingClass = LITE_APPLOG,
    name = "beforeInit",
    returnType = "V",
    parameters = emptyList(),
)

internal object NetClientSendBatchFingerprint : Fingerprint(
    definingClass = NET_CLIENT,
    name = "LB",
    returnType = "Ljava/lang/String;",
    parameters = listOf("Ljava/lang/String;", "Ljava/util/Map;"),
)

internal object NetClientSendListFingerprint : Fingerprint(
    definingClass = NET_CLIENT,
    name = "LC",
    returnType = "Ljava/lang/String;",
    parameters = listOf("Ljava/lang/String;", "Ljava/util/List;", "Ljava/util/Map;"),
)

internal object NetClientSendBytesRawFingerprint : Fingerprint(
    definingClass = NET_CLIENT,
    name = "LCCII",
    returnType = "Ljava/lang/String;",
    parameters = listOf("Ljava/lang/String;", "[B", "Ljava/util/Map;"),
)

internal object NetClientSendBytesFingerprint : Fingerprint(
    definingClass = NET_CLIENT,
    name = "LCI",
    returnType = "[B",
    parameters = listOf("Ljava/lang/String;", "[B", "Ljava/util/Map;"),
)
