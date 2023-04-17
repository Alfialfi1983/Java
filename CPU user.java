import java.util.Scanner;

public class cpu {
    private int price;

    public cpu(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public class Processor {
        private int cores;
        private String manufacturer;

        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        public int getCores() {
            return cores;
        }

        public String getManufacturer() {
            return manufacturer;
        }
    }

    public static class Ram {
        private int memory;
        private String manufacturer;

        public Ram(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public int getMemory() {
            return memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter CPU price: ");
        int cpuPrice = scanner.nextInt();

        System.out.print("Enter Processor cores: ");
        int processorCores = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter Processor manufacturer: ");
        String processorManufacturer = scanner.nextLine();

        System.out.print("Enter RAM memory: ");
        int ramMemory = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter RAM manufacturer: ");
        String ramManufacturer = scanner.nextLine();

        scanner.close();

        cpu myCpu = new cpu(cpuPrice);
        cpu.Processor myProcessor = myCpu.new Processor(processorCores, processorManufacturer);
        cpu.Ram myRam = new cpu.Ram(ramMemory, ramManufacturer);

        System.out.println("CPU price: $" + myCpu.getPrice());
        System.out.println("Processor cores: " + myProcessor.getCores());
        System.out.println("Processor manufacturer: " + myProcessor.getManufacturer());
        System.out.println("RAM memory: " + myRam.getMemory() + "GB");
        System.out.println("RAM manufacturer: " + myRam.getManufacturer());
    }
}
