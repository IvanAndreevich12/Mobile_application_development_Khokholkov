const val BASE_URL = "https://fakestoreapi.com/"

object ProductClient {
    private val moshi = Moshi.Builder)
        .add(KotlinJsonAdapterFactory())
        .build()
    private val retrofit = Retrofit Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL)
        .build()

    val client = retrofit.create(ProductService::class.java)
}