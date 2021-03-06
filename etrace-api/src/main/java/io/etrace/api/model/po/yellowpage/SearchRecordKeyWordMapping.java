package io.etrace.api.model.po.yellowpage;

import io.etrace.api.model.po.BasePersistentObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * 记录和关键字关系映射表
 */
@Data
@Entity(name = "search_record_keyword_mapping")
@EqualsAndHashCode(callSuper = true)
public class SearchRecordKeyWordMapping extends BasePersistentObject {

    private long recordId;

    private long keywordId;

    private String status;
}
