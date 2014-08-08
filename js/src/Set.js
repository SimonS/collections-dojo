function Set() {
    this.set = Array.prototype.slice.call(arguments).reduce(function(obj, val) {
        obj[val] = true;
        return obj;
    }, {});
};

Set.prototype.remove = function(member) {
    delete this.set[member];
};

Set.prototype.add = function(member) {
    this.set[member] = true;
};

Set.prototype.length = function() {
    return Object.keys(this.set).length;
};

Set.prototype.isEmpty = function() {
    return this.length() === 0;
};

Set.prototype.contains = function(member) {
    return member in this.set;
};

Set.prototype.forEach = function(fnc) {
    var i = 0;
    for (item in this.set) {
        fnc.call(this.set, item, i++);
    }
}

Set.prototype.all = function() {
    var result = true;
    for (var i = 0; i < arguments.length; i++)
        if (!this.contains(arguments[i])) result = false;

    return result;
};

Set.prototype.clone = function() {
    var newSet = new Set();
    this.forEach(function(item) {
        newSet.add(item);
    });
    return newSet;
}

// ridiculously inefficient
Set.prototype.union = function(other) {
    var newSet = this.clone();

    other.forEach(function(item) {
        newSet.add(item);
    });

    return newSet;
}

// DUPLICATION
Set.prototype.intersection = function(other) {
    var newSet = this.clone();
    newSet.forEach(function(val) {
        if (!other.contains(val)) {
            newSet.remove(val);
        }
    });
    return newSet;
};

// DUPLICATION
Set.prototype.difference = function(other) {
    var newSet = this.clone();
    newSet.forEach(function(val) {
        if (other.contains(val)) {
            newSet.remove(val);
        }
    });
    return newSet;
};
