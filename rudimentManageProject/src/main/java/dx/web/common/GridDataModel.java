package dx.web.common;

import java.util.List;

public class GridDataModel<T> {

	/**
	 * 总数
	 */
	private Integer total;

	/**
	 * 列表内容
	 */
	private List<T> rows;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}
}
