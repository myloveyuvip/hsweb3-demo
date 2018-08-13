package org.hswebframework.web.demo.repository;

import org.hswebframework.web.demo.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {

}
