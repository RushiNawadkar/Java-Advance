package com.app.Service;

import java.util.List;

import com.app.Entity.Railway;

public interface IRailwayService {
  public Railway adddeatils(Railway railway);
  public List<Railway> showDetails();
  public boolean delete(Long id);
  public List<Railway> sorting();
  public Railway update( Railway railway);
}
