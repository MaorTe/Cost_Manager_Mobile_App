package com.example.costmanager.Model;

import org.json.JSONObject;

/**
 * Represents an interface of our database.
 * gives more accessibility and flexibility to the code
 */
public interface IModel {
    /**
     * This method adds new item to database
     * @param itemName item's name
     * @param category item's category
     * @param cost item's cost
     * @param date item's bought date
     */
    void addData(String itemName,String category,String cost,String date);

    /**
     * This method gets all items from database
     * @return Returning JSONObject obejct which represents our data
     */
    public JSONObject getItems();

    /**
     * This method deletes a specifc row from database according to id
     * @param id id to delete a specific row from database
     */
    public void deleteData(String id);
}