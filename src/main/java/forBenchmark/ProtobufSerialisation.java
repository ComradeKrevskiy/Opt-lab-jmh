package forBenchmark;

import com.googlecode.protobuf.format.XmlFormat;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class ProtobufSerialisation {

    static protobufDTO.myDTO Dto = protobufDTO.myDTO.newBuilder()
            .setId(119412)
            .setFname("Mikhail")
            .setLname("Krevskiy")
            .setDormesteryPayed(true)
            .setMark(6)
            .build();

    @Benchmark
    public void serialise(){
        String result = XmlFormat.printToString(Dto);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(ProtobufSerialisation.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .build();

        new Runner(opt).run();
    }

}
