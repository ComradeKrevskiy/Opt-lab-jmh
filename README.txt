Results:
###############  ---JSONSerialisation---  ###############
# Warmup Iteration   1: 1047837,936 ops/s
# Warmup Iteration   2: 1960591,179 ops/s
# Warmup Iteration   3: 1916986,352 ops/s
# Warmup Iteration   4: 2305627,238 ops/s
# Warmup Iteration   5: 2331680,241 ops/s
Iteration   1: 2438105,665 ops/s
Iteration   2: 2482762,717 ops/s
Iteration   3: 2218391,352 ops/s
Iteration   4: 2281308,398 ops/s
Iteration   5: 2229538,337 ops/s

# Run complete. Total time: 00:00:11
Benchmark                                  Mode  Cnt        Score        Error  Units
forBenchmark.JSONSerialization.Serialise  thrpt    5  2330021,294 ± 471382,314  ops/s

###############  ---JSONDeserialisation---  ###############
# Warmup Iteration   1: 400101,720 ops/s
# Warmup Iteration   2: 1102999,698 ops/s
# Warmup Iteration   3: 1280744,987 ops/s
# Warmup Iteration   4: 1254893,426 ops/s
# Warmup Iteration   5: 1258721,853 ops/s
Iteration   1: 1327598,249 ops/s
Iteration   2: 1311361,462 ops/s
Iteration   3: 1319114,146 ops/s
Iteration   4: 1191646,556 ops/s
Iteration   5: 1273287,617 ops/s

# Run complete. Total time: 00:00:11
Benchmark                                      Mode  Cnt        Score        Error  Units
forBenchmark.JSONDeserialisation.Deserialise  thrpt    5  1284601,606 ± 215468,941  ops/s

###############  ---ProtobufSerialisation---  ###############
# Warmup Iteration   1: 78809,455 ops/s
# Warmup Iteration   2: 330924,136 ops/s
# Warmup Iteration   3: 398064,947 ops/s
# Warmup Iteration   4: 585576,449 ops/s
# Warmup Iteration   5: 521801,929 ops/s
Iteration   1: 525437,829 ops/s
Iteration   2: 560197,968 ops/s
Iteration   3: 583277,311 ops/s
Iteration   4: 554209,155 ops/s
Iteration   5: 545279,966 ops/s

# Run complete. Total time: 00:00:11
Benchmark                                      Mode  Cnt       Score       Error  Units
forBenchmark.ProtobufSerialisation.serialise  thrpt    5  553680,446 ± 81387,746  ops/s

###############  ---ProtobufDeserialisation---  ###############
# Warmup Iteration   1: 3233494,084 ops/s
# Warmup Iteration   2: 5440589,100 ops/s
# Warmup Iteration   3: 6664654,834 ops/s
# Warmup Iteration   4: 5400072,821 ops/s
# Warmup Iteration   5: 2189073,003 ops/s
Iteration   1: 1713897,194 ops/s
Iteration   2: 4829581,435 ops/s
Iteration   3: 3228793,536 ops/s
Iteration   4: 5685770,996 ops/s
Iteration   5: 4334464,846 ops/s

# Run complete. Total time: 00:00:11
Benchmark                                          Mode  Cnt        Score         Error  Units
forBenchmark.ProtobufDeserialisation.deserialise  thrpt    5  3958501,601 ± 5919953,603  ops/s

###############  ---Итог---  ###############

Benchmark                                          Mode   Cnt    Score         Error     Units
forBenchmark.JSONSerialization.Serialise          thrpt    5  2330021,294 ± 471382,314   ops/s
forBenchmark.JSONDeserialisation.Deserialise      thrpt    5  1284601,606 ± 215468,941   ops/s
forBenchmark.ProtobufSerialisation.serialise      thrpt    5  553680,446  ± 81387,746    ops/s
forBenchmark.ProtobufDeserialisation.deserialise  thrpt    5  3958501,601 ± 5919953,603  ops/s
