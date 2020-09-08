package com.cresco.assesment.json;

import java.io.Serializable;
import java.util.List;

public class QOptions implements Serializable {
private List<String> options;

public List<String> getOptions() {
	return options;
}

public void setOptions(List<String> options) {
	this.options = options;
}
}
