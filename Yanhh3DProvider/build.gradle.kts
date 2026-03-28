import com.lagradost.cloudstream3.gradle.CloudstreamExtension

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

// Thay thế đoạn cloudstream cũ bằng đoạn này
configure<CloudstreamExtension> {
    setProject("Yanhh3D", "com.lagradost", "Yanhh3DProvider")
}
