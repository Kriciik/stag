package pro1.apiDataModel;

import com.google.gson.annotations.SerializedName;

public class PrijimaciObor {
    @SerializedName("programNazev")
    public String program;
    @SerializedName("oborNazev")
    public String obornazev;
    @SerializedName("eprDeadlinePrihlaska")
    public Deadline deadline;
}
