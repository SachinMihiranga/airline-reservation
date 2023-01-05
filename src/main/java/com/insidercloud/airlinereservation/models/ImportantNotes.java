package com.insidercloud.airlinereservation.models;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "important_notes")
public class ImportantNotes {
    @Id
    private String id;
    @Field
    private String notes;
    @Field
    private String title;
    @Field
    private String date;
    @Field
    private String time;

    private String elapsedTime;

    public ImportantNotes() {}

    public ImportantNotes(String notes, String title) {
        this.notes = notes;
        this.title = title;
        this.date = LocalDateTime.now().get(ChronoField.YEAR_OF_ERA) + "-" + LocalDateTime.now().get(ChronoField.MONTH_OF_YEAR) + "-" + LocalDateTime.now().get(ChronoField.DAY_OF_MONTH);
        this.time = LocalDateTime.now().get(ChronoField.HOUR_OF_DAY) + ":" + LocalDateTime.now().get(ChronoField.MINUTE_OF_HOUR) + ":" + LocalDateTime.now().get(ChronoField.SECOND_OF_MINUTE);
    }
    public ImportantNotes(String notes, String title, String date, String time) {
        this.notes = notes;
        this.title = title;
        this.date = date;
        this.time = time;
    }

    private ImportantNotes(String notes, String title, String elapsedTime) {
        this.notes = notes;
        this.title = title;
        this.elapsedTime = elapsedTime;
    }

    public String getId() {
        return id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public String getElapsedTime() {
        return this.elapsedTime;
    }

    public void setElapsedTime() {
        PrettyTime p = new PrettyTime();
        this.elapsedTime = p.format(LocalDateTime.parse(this.getDate() + "T" + this.getTime()));
    }

    public String toString() {
        return String.format("ImportantNotes[id='%s',notes='%s', title='%s', date='%s', time='%s', elapsed='%s' ]", id,
                notes, title, date, time, elapsedTime);
    }

    public ImportantNotes getClaims() {
        this.setElapsedTime();
        return new ImportantNotes(this.getNotes(), this.getTitle(), this.getElapsedTime());
    }
}
