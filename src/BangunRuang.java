public abstract class BangunRuang {
    private String name;

    public BangunRuang(String namee) {
        this.name = namee;
    }

    public void inputNilai() {
        System.out.println("Input nilai");
    }

    public void luasPermukaan() {
        System.out.println("Menghitung luas permukaan bangun " + name);
    }

    public void volume() {
        System.out.println("Menghitung volume bangun " + name);
    }
}
