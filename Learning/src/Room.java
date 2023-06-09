public interface Room {
    String whereAreYou();
}
class Living implements Room {
    public String whereAreYou() {
        return "I am in Living room";
    }

}
class Kitchen implements Room {
    public String whereAreYou() {
        return "I am in Kitchen";
    }
}
class Drawing implements Room{
    public String whereAreYou() {
        return "I am in Drawing Room";
    }
}