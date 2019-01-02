package com.bupt.cardtest.service;

import com.bupt.cardtest.model.bean.Record;
import com.bupt.cardtest.model.bean.Upfile;
import com.bupt.cardtest.model.pageModel.DataGrid;
import com.bupt.cardtest.model.pagebean.AdminDevicePage;
import com.bupt.cardtest.model.pagebean.AdminPage;

import java.util.List;

public interface FileShowService {


    DataGrid dataGrid(AdminDevicePage adminDevicePage);

    DataGrid recordDataGrid(Upfile upfile);

    List<Record> download(String filename);
}
