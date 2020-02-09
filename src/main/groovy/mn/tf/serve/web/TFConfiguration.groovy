package mn.tf.serve.web

import groovy.transform.CompileStatic
import io.micronaut.context.annotation.Property

@CompileStatic
class TFConfiguration {
    @Property(name = "tf.url")
    public static final String TF_URL = "localhost"
    @Property(name = "tf.port")
    public static final int TF_PORT = 8501

    //this is type String,Object because some Micronaut API's used require that format
    Map<String, Object> toMap() {
        return [
                tf_url: TF_URL,
                tf_port: TF_PORT,
        ] as Map<String, Object>
    }
}