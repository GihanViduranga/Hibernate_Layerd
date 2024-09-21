package ly.pt.bo;

import ly.pt.bo.custom.BOImpl.CustomerBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {}

    public static BOFactory getBOFactory() {
        return boFactory == null ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOTypes{
        CUSTOMER
    }

    public SuperBo getBO(BOTypes boTypes){

        switch (boTypes){
            case CUSTOMER:
                return new CustomerBOImpl();

            default:
                return null;
        }
    }
}
