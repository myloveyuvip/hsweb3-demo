package org.hswebframework.web.demo.entity;

import lombok.Data;
import org.hswebframework.web.commons.entity.SimpleGenericEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "t_vendor")
public class Vendor extends SimpleGenericEntity<Long> {


    @Id
    @GeneratedValue
    private Long id;
    private String vendorName;
    private String managerOffice;
    private String address;
    private Integer isNearSchool;
    private Double longitude;
    private Double latitude;
    private String operatorName;
    private String phone;
    private String nativePlace;
    private String distribution;
    private Integer industryType;
    private Integer hasLicense;
    private String illegalInfo;
    private Integer isSpecialPlace;
    private String cigarCode;
    private String saleKind;
    private Integer monthlySales;
    private Integer noCertReson;
    private Long operateTime;
    private Long registerTime;
    private String shop_pic;
    private String remark;
    private Date gmt_create;
    private Date gmt_update;

}
