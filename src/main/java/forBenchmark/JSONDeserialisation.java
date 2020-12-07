package forBenchmark;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSONDeserialisation {
    static myDTO Dto = new myDTO();
    public static volatile Object out;
    public static ObjectMapper mapper = new ObjectMapper();
    private static byte[] data;

    static {
        try {
            String path = "C:/Users/kremi/Downloads/Opti lab3/src/main/resources/myDTO.json";
            data = Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws RunnerException {

        Options options = new OptionsBuilder()
                .include(JSONDeserialisation.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .build();
        new Runner(options).run();
    }

    @Benchmark
    public void Deserialise() throws IOException {
        myDTO result = mapper.readValue(data, myDTO.class);
    }

}