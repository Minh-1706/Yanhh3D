import com.lagradost.cloudstream3.gradle.CloudstreamExtension
import org.gradle.api.Project

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

configure<CloudstreamExtension> {
    // Chúng ta dùng hàm cloudstream trực tiếp, đây là cách viết chuẩn của template này
    cloudstream("Yanhh3D", "com.lagradost", "Yanhh3DProvider")
}
