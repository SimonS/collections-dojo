function Set() {
    this.set = Array.prototype.slice.call(arguments).reduce(function(obj, val) {
        obj[val] = true;
        return obj;
    }, {});
};

Set.prototype.isEmpty = function() {
    return Object.keys(this.set).length === 0;
};

Set.prototype.contains = function(member) {
    return member in this.set;
};
