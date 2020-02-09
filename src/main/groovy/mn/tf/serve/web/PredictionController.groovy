package mn.tf.serve.web

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

/**
 * @author Teemu Kanstren
 */

//to make a HTTP POST with JSON content
//curl -H "Content-Type: application/json" -d '{"data":[1,2]}' http://localhost:8080/classify

@Controller("/classify")
class PredictionController {
    @Post("/")
    PredictionOutput predict(@Body PredictionInput input) {
        if (input.data.length == 3) {
            return null
        }
        String tfURL = TFConfiguration.TF_URL
        String tfPort = TFConfiguration.TF_PORT
        return new PredictionOutput("aa")
    }

    @Get(value="/{+path}")
    public HttpResponse handleAnyUri(String path) {
        return HttpResponse.notFound();
    }
}
