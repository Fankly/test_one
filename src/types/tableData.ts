export interface ColumnProps {
  label?: string;
  children?: ColumnProps[];
  prop?: string;
  type?: string;
  header?: any;
  render?: any;
  slotName?: string;
}

export interface TableColumnProps {
  col: ColumnProps;
}

export interface TableProps {
  prop?: string;
  label?: string;
}

export interface Columns {
  prop?: string;
  label: string;
  render?: Function;
  slotName?: string;
  minWidth?: string;
  "show-overflow-tooltip"?: boolean;
  children?: Columns[];
  width?: string;
}
