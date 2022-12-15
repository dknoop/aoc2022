import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Day15 {
    static String input = "Sensor at x=9450, y=2172986: closest beacon is at x=-657934, y=1258930\n" +
            "Sensor at x=96708, y=1131866: closest beacon is at x=-657934, y=1258930\n" +
            "Sensor at x=1318282, y=3917725: closest beacon is at x=-39403, y=3757521\n" +
            "Sensor at x=3547602, y=1688021: closest beacon is at x=3396374, y=1626026\n" +
            "Sensor at x=3452645, y=2433208: closest beacon is at x=3249864, y=2880665\n" +
            "Sensor at x=46113, y=3689394: closest beacon is at x=-39403, y=3757521\n" +
            "Sensor at x=2291648, y=2980268: closest beacon is at x=2307926, y=3005525\n" +
            "Sensor at x=3127971, y=2022110: closest beacon is at x=3396374, y=1626026\n" +
            "Sensor at x=2301436, y=2996160: closest beacon is at x=2307926, y=3005525\n" +
            "Sensor at x=2989899, y=3239346: closest beacon is at x=3551638, y=3263197\n" +
            "Sensor at x=544144, y=3031363: closest beacon is at x=-39403, y=3757521\n" +
            "Sensor at x=3706626, y=767329: closest beacon is at x=3396374, y=1626026\n" +
            "Sensor at x=2540401, y=2746490: closest beacon is at x=2342391, y=2905242\n" +
            "Sensor at x=2308201, y=2997719: closest beacon is at x=2307926, y=3005525\n" +
            "Sensor at x=782978, y=1855194: closest beacon is at x=1720998, y=2000000\n" +
            "Sensor at x=2317632, y=2942537: closest beacon is at x=2342391, y=2905242\n" +
            "Sensor at x=1902546, y=2461891: closest beacon is at x=1720998, y=2000000\n" +
            "Sensor at x=3967424, y=1779674: closest beacon is at x=3396374, y=1626026\n" +
            "Sensor at x=2970495, y=2586314: closest beacon is at x=3249864, y=2880665\n" +
            "Sensor at x=3560435, y=3957350: closest beacon is at x=3551638, y=3263197\n" +
            "Sensor at x=3932297, y=3578328: closest beacon is at x=3551638, y=3263197\n" +
            "Sensor at x=2819004, y=1125748: closest beacon is at x=3396374, y=1626026\n" +
            "Sensor at x=2793841, y=3805575: closest beacon is at x=3015097, y=4476783\n" +
            "Sensor at x=3096324, y=109036: closest beacon is at x=3396374, y=1626026\n" +
            "Sensor at x=3678551, y=3050855: closest beacon is at x=3551638, y=3263197\n" +
            "Sensor at x=1699186, y=3276187: closest beacon is at x=2307926, y=3005525\n" +
            "Sensor at x=3358443, y=3015038: closest beacon is at x=3249864, y=2880665\n" +
            "Sensor at x=2309805, y=1755792: closest beacon is at x=1720998, y=2000000\n" +
            "Sensor at x=2243001, y=2876549: closest beacon is at x=2342391, y=2905242\n" +
            "Sensor at x=2561955, y=3362969: closest beacon is at x=2307926, y=3005525\n" +
            "Sensor at x=2513546, y=2393940: closest beacon is at x=2638370, y=2329928\n" +
            "Sensor at x=1393638, y=419289: closest beacon is at x=1720998, y=2000000\n" +
            "Sensor at x=2696979, y=2263077: closest beacon is at x=2638370, y=2329928\n" +
            "Sensor at x=3842041, y=2695378: closest beacon is at x=3249864, y=2880665";

    record Range(int start, int end){}
    record SensorRange(int x, int y, int distance) {
        private boolean inRange(int tx, int ty) {
            return (Math.abs(tx - x) + Math.abs(ty - y)) <= distance;
        }
    }

    public static void main(String[] args) {
        String[] lines = input.split("\\R");
        List<Range> ranges = new ArrayList<>();
        List<SensorRange> sensorRanges = new ArrayList<>();

        for (String line : lines) {

            String[] parts = line.split(",*:*\\s");
            int sensorX = Integer.parseInt(parts[2].split("=")[1]);
            int sensorY = Integer.parseInt(parts[3].split("=")[1]);

            int beaconX = Integer.parseInt(parts[8].split("=")[1]);
            int beaconY = Integer.parseInt(parts[9].split("=")[1]);

            int distance = Math.abs(sensorX - beaconX) + Math.abs(sensorY - beaconY);
            int rangeWidth = distance - Math.abs(sensorY - 2000000);
            ranges.add(new Range(sensorX - rangeWidth, sensorX + rangeWidth));

            sensorRanges.add(new SensorRange(sensorX, sensorY, distance));

        }

        ranges = ranges.stream().filter(r -> r.start < r.end).collect(Collectors.toList());
        ranges = simplifyRanges(ranges);
        System.out.println(ranges.stream().mapToInt(r -> r.end - r.start).sum());

        for(SensorRange sensor : sensorRanges) {
            for (int i = -(sensor.distance + 1); i <= sensor.distance; i++) {
                int width = (sensor.distance - Math.abs(i));

                if(isCoordinateOutsideSensorRange(sensorRanges, (sensor.x - width - 1), (sensor.y + i)) ||
                        isCoordinateOutsideSensorRange(sensorRanges, (sensor.x + width + 1), (sensor.y + i))) {
                    return;
                }
            }
        }

    }

    static List<Range> simplifyRanges(List<Range> ranges) {

        ranges.sort(Comparator.comparingInt(r -> r.start));

        List<Range> simplified = new ArrayList<>();
        simplified.add(ranges.get(0));

        for (int i = 1; i < ranges.size(); i++) {
            Range current = ranges.get(i);
            Range last = simplified.get(simplified.size() - 1);
            // if ranges connect or overlap, update
            if (current.start <= last.end + 1) {
                simplified.set(simplified.size() - 1, new Range(last.start, Math.max(last.end, current.end)));
            } else {
                simplified.add(current);
            }
        }
        return simplified;
    }

    static boolean isCoordinateOutsideSensorRange(List<SensorRange> sensors, int tx, int ty) {
        if(tx >= 0 && tx <= 4000000 && ty >= 0 && ty <= 4000000
                && sensors.stream().noneMatch(sensor -> sensor.inRange(tx, ty))) {
            System.out.println("Found point outside sensor ranges: " + tx + ", " + ty);
            System.out.println("Frequency: " + BigInteger.valueOf(tx).multiply(BigInteger.valueOf(4000000)).add(BigInteger.valueOf((ty))));
            return true;
        }
        return false;
    }
}
