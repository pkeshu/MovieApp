package com.pickndrop.movieapp.data.api
import com.pickndrop.movieapp.data.vo.MovieDetails
import com.pickndrop.movieapp.data.vo.MovieResponse
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TheMovieDBInterface {

    // https://api.themoviedb.org/3/movie/popular?api_key=245367a446dd632490e5b6b0fdd85602&page=1
    // https://api.themoviedb.org/3/
    //https://api.themoviedb.org/3/movie/454626?api_key=245367a446dd632490e5b6b0fdd85602

    @GET("movie/popular")
    fun getPopularMovie(@Query("page") page: Int): Observable<MovieResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") id: Int): Observable<MovieDetails>
}