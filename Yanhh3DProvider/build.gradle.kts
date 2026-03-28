import com.lagradost.cloudstream3.gradle.CloudstreamExtension

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

configure<CloudstreamExtension> {
    // Sử dụng setProperty để tránh lỗi "Val cannot be reassigned"
    setProperty("name", "Yanhh3D")
    setProperty("pkg", "com.lagradost")
    setProperty("authors", listOf("Minh-1706"))
    description = "Yanhh3D Provider"
}
