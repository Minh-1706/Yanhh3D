import com.lagradost.cloudstream3.gradle.CloudstreamExtension

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

configure<CloudstreamExtension> {
    // Sử dụng hàm cloudstream mới thay vì setProject
    cloudstream("Yanhh3D", "com.lagradost", "Yanhh3DProvider")
}
