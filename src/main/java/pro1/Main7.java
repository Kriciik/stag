package pro1;

import com.google.gson.Gson;
import pro1.apiDataModel.PrijimaciOborList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main7 {

    public static void main(String[] args) {
        System.out.println(specializationDeadlines(2025));
    }
    public static String specializationDeadlines(int year) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yyyy");

        String json = Api.getSpecializations(year);
        PrijimaciOborList prijimaciOborList = new Gson().fromJson(json, PrijimaciOborList.class);

        return prijimaciOborList.items.stream()
                .filter(i -> i.deadline != null && i.deadline.value != null)
                .map(i -> i.deadline.value)
                .distinct()
                .sorted(Comparator.comparing(dateStr -> LocalDate.parse(dateStr, formatter)))
                .collect(Collectors.joining(","));
    }
}
