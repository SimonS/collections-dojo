function Set() {
    this.set = Array.prototype.slice.call(arguments).reduce(function(obj, val) {
        obj[val] = true;
        return obj;
    }, {});
};

Set.prototype.isEmpty = function() {
    return this.length() === 0;
};

Set.prototype.contains = function(member) {
    return member in this.set;
};

Set.prototype.length = function() {
    return Object.keys(this.set).length;
};
