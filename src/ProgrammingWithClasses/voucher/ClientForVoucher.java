package ProgrammingWithClasses.voucher;

public class ClientForVoucher {

    private Voucher[] vouchersData;

    public ClientForVoucher() {
    }

    public ClientForVoucher(Voucher[] vouchers) {
        this.vouchersData = vouchers;
    }

    public void showAllVouchers(Voucher[] vouchersData) {
        for (int i = 0; i < vouchersData.length; i++) {
            System.out.println(vouchersData[i]);
        }
    }

    public Voucher[] searchVouchersByType(Voucher[] vouchersData, String type) {
        int count = 0;
        for (int i = 0; i < vouchersData.length; i++) {
            if (vouchersData[i].getTypeOfRest().equals(type)) {
                count++;
            }
        }
        Voucher[] sortedListOfVouchers = new Voucher[count];
        int index = 0;
        for (int i = 0; i < vouchersData.length; i++) {
            if (vouchersData[i].getTypeOfRest().equals(type)) {
                sortedListOfVouchers[index++] = vouchersData[i];
            }
        }
        return sortedListOfVouchers;
    }

    public Voucher[] searchVouchersByTransfer(Voucher[] vouchersData, String transfer) {
        int count = 0;
        for (int i = 0; i < vouchersData.length; i++) {
            if (vouchersData[i].getTransfer().equals(transfer)) {
                count++;
            }
        }
        Voucher[] sortedListOfVouchers = new Voucher[count];
        int index = 0;
        for (int i = 0; i < vouchersData.length; i++) {
            if (vouchersData[i].getTransfer().equals(transfer)) {
                sortedListOfVouchers[index++] = vouchersData[i];
            }
        }
        return sortedListOfVouchers;
    }

    public Voucher[] searchVouchersByFood(Voucher[] vouchersData, String food) {
        int count = 0;
        for (int i = 0; i < vouchersData.length; i++) {
            if (vouchersData[i].getFood().equals(food)) {
                count++;
            }
        }
        Voucher[] sortedListOfVouchers = new Voucher[count];
        int index = 0;
        for (int i = 0; i < vouchersData.length; i++) {
            if (vouchersData[i].getFood().equals(food)) {
                sortedListOfVouchers[index++] = vouchersData[i];
            }
        }
        return sortedListOfVouchers;
    }

    public Voucher[] searchVouchersByLength(Voucher[] vouchersData, int length) {
        int count = 0;
        for (int i = 0; i < vouchersData.length; i++) {
            if (vouchersData[i].getLength() >= length) {
                count++;
            }
        }
        Voucher[] sortedListOfVouchers = new Voucher[count];
        int index = 0;
        for (int i = 0; i < vouchersData.length; i++) {
            if (vouchersData[i].getLength() >= length) {
                sortedListOfVouchers[index++] = vouchersData[i];
            }
        }
        return sortedListOfVouchers;
    }

    public Voucher[] sortVouchersByCosts(Voucher[] vouchers) {
        Voucher[] sortedListOfVouchers = new Voucher[vouchers.length];
        for (int i = 0; i < vouchers.length; i++) {
            sortedListOfVouchers[i] = vouchers[i];
        }
        for (int i = 0; i < sortedListOfVouchers.length; i++) {
            for (int j = sortedListOfVouchers.length - 1; j > i; j--) {
                if (sortedListOfVouchers[j].getCost() < sortedListOfVouchers[j - 1].getCost()) {
                    Voucher currentVoucher = sortedListOfVouchers[j];
                    sortedListOfVouchers[j] = sortedListOfVouchers[j - 1];
                    sortedListOfVouchers[j - 1] = currentVoucher;
                }
            }
        }
        return sortedListOfVouchers;
    }
}
