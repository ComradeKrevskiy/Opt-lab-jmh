package forBenchmark;

import com.google.protobuf.InvalidProtocolBufferException;
import com.googlecode.protobuf.format.XmlFormat;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class ProtobufDeserialisation {

    static protobufDTO.myDTO Dto = protobufDTO.myDTO.newBuilder()
            .setId(119412)
            .setFname("Mikhail")
            .setLname("Krevskiy")
            .setDormesteryPayed(true)
            .setMark(6)
            .build();

    private static byte[] data = Dto.toByteArray();

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(ProtobufDeserialisation.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .build();

        new Runner(opt).run();
    }

    @Benchmark
    public void deserialise() throws InvalidProtocolBufferException {
        protobufDTO.myDTO result = protobufDTO.myDTO.parseFrom(data);
    }

}
