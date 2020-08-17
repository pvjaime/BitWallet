package cl.jaimikus.bitwallet.model;

import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("private")
    private String mPrivate;
    @SerializedName("public")
    private String mPublic;
    @SerializedName("address")
    private String mAddress;
    @SerializedName("wif")
    private String mWif;

    public Address(String mPrivate, String mPublic, String mAddress, String mWif) {
        this.mPrivate = mPrivate;
        this.mPublic = mPublic;
        this.mAddress = mAddress;
        this.mWif = mWif;
    }

    public String getmPrivate() {
        return mPrivate;
    }

    public void setmPrivate(String mPrivate) {
        this.mPrivate = mPrivate;
    }

    public String getmPublic() {
        return mPublic;
    }

    public void setmPublic(String mPublic) {
        this.mPublic = mPublic;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmWif() {
        return mWif;
    }

    public void setmWif(String mWif) {
        this.mWif = mWif;
    }
}
