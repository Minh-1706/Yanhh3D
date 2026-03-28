import com.lagradost.cloudstream3.gradle.CloudstreamExtension

apply(plugin = "com.android.library")
apply(plugin = "kotlin-android")
apply(plugin = "com.lagradost.cloudstream3.gradle")

cloudstream {
    name = "Yanhh3D"
    description = "Yanhh3D Provider"
    pkg = "com.lagradost"
    authors = listOf("Minh-1706")
}
