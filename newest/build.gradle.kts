plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("com.google.accompanist:accompanist-adaptive:latest.release")
    implementation("com.google.accompanist:accompanist-themeadapter-appcompat:latest.release")
    implementation("com.google.accompanist:accompanist-drawablepainter:latest.release")
    implementation("com.google.accompanist:accompanist-flowlayout:latest.release")
    implementation("com.google.accompanist:accompanist-themeadapter-material3:latest.release")
    implementation("com.google.accompanist:accompanist-themeadapter-material:latest.release")
    implementation("com.google.accompanist:accompanist-navigation-animation:latest.release")
    implementation("com.google.accompanist:accompanist-navigation-material:latest.release")
    implementation("com.google.accompanist:accompanist-pager:latest.release")
    implementation("com.google.accompanist:accompanist-pager-indicators:latest.release")
    implementation("com.google.accompanist:accompanist-permissions:latest.release")
    implementation("com.google.accompanist:accompanist-placeholder:latest.release")
    implementation("com.google.accompanist:accompanist-placeholder-material:latest.release")
    implementation("com.google.accompanist:accompanist-systemuicontroller:latest.release")
    implementation("com.google.accompanist:accompanist-testharness:latest.release")
    implementation("com.google.accompanist:accompanist-webview:latest.release")
    implementation("androidx.constraintlayout:constraintlayout-compose:latest.release")
    implementation("com.github.fornewid:material-motion-compose:latest.release")

    implementation("androidx.compose.animation:animation:latest.release")
    implementation("androidx.compose.compiler:compiler:latest.release")
    implementation("androidx.compose.foundation:foundation:latest.release")
    implementation("androidx.compose.material:material:latest.release")
    implementation("androidx.compose.material3:material3:latest.release")
    implementation("androidx.compose.material3:material3-window-size-class:latest.release")
    implementation("androidx.compose.ui:ui:latest.release")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:latest.release")



    implementation("androidx.activity:activity-compose:latest.release")
    implementation("androidx.activity:activity-ktx:latest.release")

    implementation("com.tencent.bugly:crashreport:latest.release")
    implementation("com.tencent.bugly:crashreport_upgrade:latest.release")

    implementation("androidx.camera:camera-camera2:latest.release")
    implementation("androidx.camera:camera-core:latest.release")
    implementation("androidx.camera:camera-extensions:latest.release")
    implementation("androidx.camera:camera-lifecycle:latest.release")
    implementation("androidx.camera:camera-video:latest.release")
    implementation("androidx.camera:camera-view:latest.release")

    debugImplementation("com.github.chuckerteam.chucker:library:latest.release")
    releaseImplementation("com.github.chuckerteam.chucker:library-no-op:latest.release")

    implementation("androidx.core:core-ktx:latest.release")
    implementation("androidx.core:core-splashscreen:latest.release")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:latest.release")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:latest.release")

    implementation("com.github.yalantis:ucrop:latest.release")
    implementation("com.github.yalantis:ucrop:latest.release")

    kapt("me.laoyuyu.aria:compiler:latest.release")
    implementation("me.laoyuyu.aria:core:latest.release")
    implementation("me.laoyuyu.aria:ftp:latest.release")
    implementation("me.laoyuyu.aria:m3u8:latest.release")
    implementation("me.laoyuyu.aria:sftp:latest.release")

    kapt("com.airbnb.android:epoxy-processor:latest.release")
    implementation("com.airbnb.android:epoxy-compose:latest.release")
    implementation("com.airbnb.android:epoxy:latest.release")
    implementation("com.airbnb.android:epoxy-glide-preloading:latest.release")

    implementation("androidx.tonyodev.fetch2:xfetch2:latest.release")
    implementation("androidx.tonyodev.fetch2okhttp:xfetch2okhttp:latest.release")

    implementation("io.github.reactivecircus.flowbinding:flowbinding-activity:latest.release")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-android:latest.release")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-appcompat:latest.release")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-core:latest.release")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-drawerlayout:latest.release")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-lifecycle:latest.release")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-material:latest.release")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-navigation:latest.release")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-preference:latest.release")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-recyclerview:latest.release")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-swiperefreshlayout:latest.release")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-viewpager:latest.release")
    implementation("io.github.reactivecircus.flowbinding:flowbinding-viewpager2:latest.release")

    implementation("androidx.fragment:fragment-ktx:latest.release")
    testImplementation("androidx.fragment:fragment-testing:latest.release")

    kapt("com.github.bumptech.glide:compiler:latest.release")
    implementation("com.github.bumptech.glide:glide:latest.release")
    implementation("com.github.bumptech.glide:okhttp3-integration:latest.release")

    implementation("io.github.lucksiege:camerax:latest.release")
    implementation("io.github.lucksiege:compress:latest.release")
    implementation("io.github.lucksiege:pictureselector:latest.release")
    implementation("io.github.lucksiege:ucrop:latest.release")

    implementation("com.geyifeng.immersionbar:immersionbar:latest.release")
    implementation("com.geyifeng.immersionbar:immersionbar-ktx:latest.release")

    implementation("io.insert-koin:koin-android:latest.release")
    implementation("io.insert-koin:koin-annotations:latest.release")
    implementation("io.insert-koin:koin-ksp-compiler:latest.release")
    implementation("io.insert-koin:koin-androidx-compose:latest.release")
    implementation("io.insert-koin:koin-core:latest.release")
    implementation("io.insert-koin:koin-androidx-navigation:latest.release")
    testImplementation("io.insert-koin:koin-test-junit5:latest.release")
    implementation("io.insert-koin:koin-androidx-workmanager:latest.release")

    implementation("org.jetbrains.kotlin:kotlin-reflect:latest.release")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:latest.release")

    implementation("androidx.lifecycle:lifecycle-common:latest.release")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:latest.release")
    implementation("androidx.lifecycle:lifecycle-process:latest.release")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:latest.release")
    implementation("androidx.lifecycle:lifecycle-viewmodel-savedstate:latest.release")
    implementation("androidx.lifecycle:lifecycle-service:latest.release")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:latest.release")

    implementation("com.airbnb.android:mavericks-compose:latest.release")
    implementation("com.airbnb.android:mavericks:latest.release")
    implementation("com.airbnb.android:mavericks-navigation:latest.release")

    kapt("com.squareup.moshi:moshi-kotlin-codegen:latest.release")
    implementation("com.squareup.moshi:moshi:latest.release")

    implementation("androidx.navigation:navigation-compose:latest.release")
    implementation("androidx.navigation:navigation-fragment-ktx:latest.release")
    testImplementation("androidx.navigation:navigation-testing:latest.release")
    implementation("androidx.navigation:navigation-ui-ktx:latest.release")

    implementation("com.liulishuo.okdownload:okdownload:latest.release")
    implementation("com.liulishuo.okdownload:filedownloader:latest.release")
    implementation("com.liulishuo.okdownload:ktx:latest.release")
    implementation("com.liulishuo.okdownload:okhttp:latest.release")
    implementation("com.liulishuo.okdownload:sqlite:latest.release")

    implementation("com.squareup.okhttp3:okhttp:latest.release")
    implementation("com.squareup.okhttp3:logging-interceptor:latest.release")
    androidTestImplementation("com.squareup.okhttp3:mockwebserver:latest.release")

    kapt("com.airbnb.android:paris-processor:latest.release")
    implementation("com.airbnb.android:paris:latest.release")

    implementation("com.squareup.retrofit2:retrofit:latest.release")
    implementation("com.squareup.retrofit2:converter-moshi:latest.release")
    implementation("com.squareup.retrofit2:converter-scalars:latest.release")

    kapt("androidx.room:room-compiler:latest.release")
    implementation("androidx.room:room-runtime:latest.release")
    implementation("androidx.room:room-ktx:latest.release")
    testImplementation("androidx.room:room-testing:latest.release")

    implementation("androidx.sqlite:sqlite-framework:latest.release")
    implementation("androidx.sqlite:sqlite-ktx:latest.release")

    implementation("com.facebook.stetho:stetho:latest.release")
    implementation("com.facebook.stetho:stetho-okhttp3:latest.release")

    implementation("jp.wasabeef.transformers:coil:latest.release")
    implementation("jp.wasabeef.transformers:coil-gpu:latest.release")
    implementation("jp.wasabeef.transformers:core:latest.release")
    implementation("jp.wasabeef.transformers:glide:latest.release")
    implementation("jp.wasabeef.transformers:glide-gpu:latest.release")

    implementation("net.gotev:uploadservice:latest.release")
    implementation("net.gotev:uploadservice-ftp:latest.release")
    implementation("net.gotev:uploadservice-okhttp:latest.release")

    implementation("androidx.work:work-runtime-ktx:latest.release")
    testImplementation("androidx.work:work-testing:latest.release")



    implementation("com.aliyun.dpa:oss-android-sdk:latest.release")
    implementation("com.aliyun.ams:alicloud-android-push:latest.release")
    implementation("com.blankj:utilcodex:latest.release")
    implementation("androidx.annotation:annotation:latest.release")
    implementation("androidx.appcompat:appcompat:latest.release")
    implementation("com.github.JavaNoober.BackgroundLibrary:libraryx:latest.release")
    implementation("io.github.razerdp:BasePopup:latest.release")
    implementation("me.jorgecastillo:androidcolorx:latest.release")
    implementation("id.zelory:compressor:latest.release")
    implementation("com.github.loperSeven:DateTimePicker:latest.release")
    implementation("com.github.princekin-f:EasyFloat:latest.release")
    implementation("androidx.exifinterface:exifinterface:latest.release")
    implementation("io.github.hoc081098:FlowExt-jvm:latest.release")
    implementation("com.github.seancfoley:ipaddress:latest.release")
    implementation("joda-time:joda-time:latest.release")
    implementation("com.squareup.leakcanary:leakcanary-android:latest.release")
    implementation("com.vanniktech:gradle-maven-publish-plugin:latest.release")
    implementation("com.tencent:mmkv-static:latest.release")
    implementation("androidx.paging:paging-runtime-ktx:latest.release")
    implementation("com.github.DSAppTeam:PanelSwitchHelper:latest.release")
    implementation("com.localebro:okhttpprofiler:latest.release")
    implementation("com.github.jenly1314:zxing-lite:latest.release")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:latest.release")
    implementation("com.github.liangjingkanji:soft-input-event:latest.release")
    implementation("com.github.qiushui95:AndroidInitializer:latest.release")
    implementation("com.dropbox.mobile.store:store4:latest.release")
    implementation("com.tencent.vasdolly:helper:latest.release")
    implementation("com.tencent.mm.opensdk:wechat-sdk-android-without-mta:latest.release")
    implementation("com.iqiyi.xcrash:xcrash-android-lib:latest.release")
    implementation("com.github.li-xiaojun:XPopup:latest.release")
    implementation("com.github.getActivity:XXPermissions:latest.release")
    implementation("net.lingala.zip4j:zip4j:latest.release")



    androidTestImplementation("androidx.test.espresso:espresso-core:latest.release")
    testImplementation("org.junit.jupiter:junit-jupiter:latest.release")
    testImplementation("androidx.test.ext:junit-ktx:latest.release")



    implementation("com.github.Justson.AgentWeb:agentweb-core:latest.release")
    implementation("com.github.xiaohaibin:XBanner:latest.release")
    implementation("com.github.Dimezis:BlurView:latest.release")
    implementation("com.ashokvarma.android:bottom-navigation-bar:latest.release")
    implementation("me.majiajie:pager-bottom-tab-strip:latest.release")
    implementation("androidx.constraintlayout:constraintlayout:latest.release")
    implementation("io.github.csdn-mobile:RoundView:latest.release")
    implementation("com.tbuonomo:dotsindicator:latest.release")
    implementation("com.google.android.flexbox:flexbox:latest.release")
    implementation("com.github.dkzwm:fet-core:latest.release")
    implementation("com.airbnb.android:lottie:latest.release")
    implementation("com.google.android.material:material:latest.release")
    implementation("com.github.mhiew:android-pdf-viewer:latest.release")
    implementation("com.github.chrisbanes:PhotoView:latest.release")
    implementation("io.github.chaosleung:pinview:latest.release")
    implementation("androidx.recyclerview:recyclerview:latest.release")
    implementation("com.github.fondesa:recycler-view-divider:latest.release")
    implementation("com.github.rubensousa:gravitysnaphelper:latest.release")
    implementation("com.github.donkingliang:ConsecutiveScroller:latest.release")

    implementation("io.github.scwang90:refresh-footer-classics:latest.release")
    implementation("io.github.scwang90:refresh-header-classics:latest.release")
    implementation("io.github.scwang90:refresh-layout-kernel:latest.release")
    implementation("io.github.scwang90:refresh-header-two-level:latest.release")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:latest.release")
    implementation("com.kyleduo.switchbutton:library:latest.release")

    implementation("com.github.angcyo.DslTablayout:TabLayout:latest.release")
    implementation("com.github.angcyo.DslTablayout:ViewPager1Delegate:latest.release")
    implementation("com.github.angcyo.DslTablayout:ViewPager2Delegate:latest.release")
    implementation("androidx.viewpager2:viewpager2:latest.release")
}