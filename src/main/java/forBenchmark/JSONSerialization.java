
package forBenchmark;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONSerialization {
    public static myDTO Dto = new myDTO();
    public static ObjectMapper mapper = new ObjectMapper();


    public static void main(String[] args) throws RunnerException {

        Options options = new OptionsBuilder()
                .include(JSONSerialization.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .build();
        new Runner(options).run();
    }

    @Benchmark
    public void Serialise() throws JsonProcessingException {
        String result = mapper.writeValueAsString(Dto);
    }
}
