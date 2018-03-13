package fr.wcs.blablawild;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by wilder on 13/03/18.
 */
public class SearchModel implements Parcelable {


    private SearchModel(Parcel in) {
        departure = in.readString();
        destination = in.readString();
        date = in.readString();
    }

    public static final Creator<SearchModel> CREATOR = new Creator<SearchModel>() {
        @Override
        public SearchModel createFromParcel(Parcel in) {
            return new SearchModel(in);
        }

        @Override
        public SearchModel[] newArray(int size) {
            return new SearchModel[size];
        }
    };

    public String getDeparture() {
            return departure;
        }

        public void setDeparture(String departure) {
            this.departure = departure;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String departure, destination, date;

        public SearchModel(String departure, String destination, String date) {
            this.departure = departure;
            this.destination = destination;
            this.date = date;
        }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(departure);
        parcel.writeString(destination);
        parcel.writeString(date);
    }
}

