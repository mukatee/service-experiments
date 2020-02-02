package mn.tf.serve.web

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

/**
 * @author Teemu Kanstren
 */

@Controller("/classify")
class PredictionController {
    @Post("/")
    PredictionOutput predict(@Body PredictionInput input) {
        return new PredictionOutput("aa")
    }

}
