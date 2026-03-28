import com.lagradost.cloudstream3.gradle.CloudstreamExtension

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

configure<CloudstreamExtension> {
    // Sử dụng hàm thay vì gán biến để tránh lỗi "Val cannot be reassigned"
    setProject("Yanhh3D", "com.lagradost", "Yanhh3DProvider")
}
