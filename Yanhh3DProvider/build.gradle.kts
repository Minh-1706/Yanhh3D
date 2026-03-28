import com.lagradost.cloudstream3.gradle.CloudstreamExtension

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

configure<CloudstreamExtension> {
    // Không đặt 'name' ở đây vì Gradle đã lấy tên thư mục 'Yanhh3DProvider' làm tên rồi.
    pkg = "com.lagradost"
    authors = listOf("Minh-1706")
    description = "Yanhh3D Provider"
}
