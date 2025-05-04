package pro1.apiDataModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PrijimaciOborList {
    @SerializedName("prijimaciObor")
    public List<PrijimaciObor> items;
}
