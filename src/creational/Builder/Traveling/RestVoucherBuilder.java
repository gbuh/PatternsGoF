package creational.Builder.Traveling;

public class RestVoucherBuilder extends VoucherBuilder {

    @Override
    public void buildName() {
        voucher.setName("Rest and relax");
    }

    @Override
    public void buildType() {
        voucher.setType(Type.REST);
    }

    @Override
    public void buildTransport() {
        voucher.setTransport(Transport.BUS);
    }

    @Override
    public void buildMeals() {
        voucher.setMeals(Meals.BREAKFAST);
    }

    @Override
    public void buildPrice() {
        voucher.setPrice(100);
    }
}
