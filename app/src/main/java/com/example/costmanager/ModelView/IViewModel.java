package com.example.costmanager.ModelView;

/**
 * Represents an interface of our model.
 * gives more accessibility and flexibility to the code
 */
public interface IViewModel {
    /**
     * This method sends to the client all items
     * from the database for View Report page
     */
    public void getReport();
    /**
     * This method adds new item to the database.
     * @param itemName item's name
     * @param category item's category
     * @param cost item's cost
     * @param date item's bought date
     */
    public void addItem(final String itemName,final String category,final String cost,final String date);
    /**
     * This method sends to the client all items
     * from the database for Add Item page
     */
    void showItems();
    /**
     * This method delete a item from the database
     * @param id id to delete a specific row from database
     */
    void deleteItemVM(final String id);
}
