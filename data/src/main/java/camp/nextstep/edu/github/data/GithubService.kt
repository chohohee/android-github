package camp.nextstep.edu.github.data

import camp.nextstep.edu.github.data.model.GithubModel
import retrofit2.Response
import retrofit2.http.GET

internal interface GithubService {

    @GET("repositories")
    suspend fun getRepositories(): Response<List<GithubModel>>

}