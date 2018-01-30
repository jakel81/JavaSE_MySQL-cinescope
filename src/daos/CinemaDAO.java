/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.*;

/**
 *
 * @author Jessica
 */
public class CinemaDAO {

    private final Connection icnx;

    public CinemaDAO(Connection icnx) {
        this.icnx = icnx;
    }

}
