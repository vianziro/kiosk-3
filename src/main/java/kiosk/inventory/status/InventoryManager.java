package kiosk.inventory.status;

import java.util.List;

import kiosk.archive.Movie;

public interface InventoryManager {

    void initialize(List<Movie> movies);

}
